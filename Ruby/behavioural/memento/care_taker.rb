# The Caretaker doesn't depend on the Concrete Memento class. Therefore, it
# doesn't have access to the originator's state, stored inside the memento. It
# works with all mementos via the base Memento interface.
class Caretaker
  # @param [Originator] originator
  def initialize(originator)
    @mementos = []
    @originator = originator
  end

  def backup
    puts "\nCaretaker: Saving Originator's state..."
    @mementos << @originator.save
  end

  def undo
    return if @mementos.empty?

    memento = @mementos.pop
    puts "Caretaker: Restoring state to: #{memento.name}"

    begin
      @originator.restore(memento)
    rescue StandardError
      undo
    end
  end

  def show_history
    puts 'Caretaker: Here\'s the list of mementos:'

    @mementos.each { |memento| puts memento.name }
  end
end
