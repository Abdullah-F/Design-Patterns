require("./memento.rb")
class ConcreteMemento < Memento
  # @param [String] state
  def initialize(state)
    @state = state
    @date = Time.now.strftime('%F %T')
  end

  # The Originator uses this method when restoring its state.
  attr_reader :state

  # The rest of the methods are used by the Caretaker to display metadata.
  def name
    "#{@date} / (#{@state[0, 9]}...)"
  end

  # @return [String]
  attr_reader :date
end

