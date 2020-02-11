require("./concrete_memento.rb")
# The Originator holds some important state that may change over time. It also
# defines a method for saving the state inside a memento and another method for
# restoring the state from it.
class Originator
  # For the sake of simplicity, the originator's state is stored inside a single
  # variable.
  attr_accessor :state
  private :state

  # @param [String] state
  def initialize(state)
    @state = state
    puts "Originator: My initial state is: #{@state}"
  end

  # The Originator's business logic may affect its internal state. Therefore,
  # the client should backup the state before launching methods of the business
  # logic via the save() method.
  def do_something
    puts 'Originator: I\'m doing something important.'
    @state = generate_random_string(30)
    puts "Originator: and my state has changed to: #{@state}"
  end

  private def generate_random_string(length = 10)
    ascii_letters = [*'a'..'z', *'A'..'Z']
    (0...length).map { ascii_letters.sample }.join
  end

  # Saves the current state inside a memento.
  def save
    ConcreteMemento.new(@state)
  end

  # Restores the Originator's state from a memento object.
  def restore(memento)
    @state = memento.state
    puts "Originator: My state has changed to: #{@state}"
  end
end
