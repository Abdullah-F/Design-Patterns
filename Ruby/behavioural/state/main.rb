require("./context.rb")
require("./concrete_state_a.rb")
# The client code.

context = Context.new(ConcreteStateA.new)
context.request1
context.request2
