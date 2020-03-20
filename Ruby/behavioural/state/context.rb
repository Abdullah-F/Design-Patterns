# The Context defines the interface of interest to clients. It also maintains a
# reference to an instance of a State subclass, which represents the current
# state of the Context.
class Context
  # A reference to the current state of the Context.
  attr_accessor :state
  private :state

  # @param [State] state
  def initialize(state)
    transition_to(state)
  end

  # The Context allows changing the State object at runtime.
  def transition_to(state)
    puts "Context: Transition to #{state.class}"
    @state = state
    @state.context = self
  end

  # The Context delegates part of its behavior to the current State object.

  def request1
    @state.handle1
  end

  def request2
    @state.handle2
  end
end
