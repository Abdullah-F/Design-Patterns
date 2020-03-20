require("./state.rb")
require("./concrete_state_b.rb")
# Concrete States implement various behaviors, associated with a state of the
# Context.

class ConcreteStateA < State
  def handle1
    puts 'ConcreteStateA handles request1.'
    puts 'ConcreteStateA wants to change the state of the context.'
    @context.transition_to(ConcreteStateB.new)
  end

  def handle2
    puts 'ConcreteStateA handles request2.'
  end
end
