require("./context.rb")
require("./concrete_state_a.rb")
# The client code.

context = Context.new(ConcreteStateA.new)  # => #<Context:0x0000556903de2788 @state=#<ConcreteStateA:0x0000556903de27b0 @context=#<Context:0x0000556903de2788 ...>>>
context.request1  # => #<Context:0x0000556903de2788 @state=#<ConcreteStateB:0x0000556903de2210 @context=#<Context:0x0000556903de2788 ...>>>
context.request2  # => #<Context:0x0000556903de2788 @state=#<ConcreteStateA:0x0000556903de1e00 @context=#<Context:0x0000556903de2788 ...>>>

# >> Context: Transition to ConcreteStateA
# >> ConcreteStateA handles request1.
# >> ConcreteStateA wants to change the state of the context.
# >> Context: Transition to ConcreteStateB
# >> ConcreteStateB handles request2.
# >> ConcreteStateB wants to change the state of the context.
# >> Context: Transition to ConcreteStateA
