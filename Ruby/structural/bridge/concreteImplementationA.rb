require("./implementation.rb")
# Each Concrete Implementation corresponds to a specific platform and implements
# the Implementation interface using that platform's API.
class ConcreteImplementationA < Implementation
  # @return [String]
  def operation_implementation
    'ConcreteImplementationA: Here\'s the result on the platform A.'
  end
end
