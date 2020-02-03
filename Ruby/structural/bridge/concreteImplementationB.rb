require("./implementation.rb")

class ConcreteImplementationB < Implementation
  # @return [String]
  def operation_implementation
    'ConcreteImplementationB: Here\'s the result on the platform B.'
  end
end
