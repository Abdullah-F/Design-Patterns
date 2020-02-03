require("./abstraction.rb")
require("./extendedAbstraction.rb")
require("./concreteImplementationB.rb")
require("./concreteImplementationA.rb")
# Except for the initialization phase, where an Abstraction object gets linked
# with a specific Implementation object, the client code should only depend on
# the Abstraction class. This way the client code can support any abstraction-
# implementation combination.
def client_code(abstraction)
  # ...

  print abstraction.operation

  # ...
end

# The client code should be able to work with any pre-configured abstraction-
# implementation combination.

implementation = ConcreteImplementationA.new
abstraction = Abstraction.new(implementation)
client_code(abstraction)

puts "\n\n"

implementation = ConcreteImplementationB.new
abstraction = ExtendedAbstraction.new(implementation)
client_code(abstraction)
