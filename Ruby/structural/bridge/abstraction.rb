# The Abstraction defines the interface for the "control" part of the two class
# hierarchies. It maintains a reference to an object of the Implementation
# hierarchy and delegates all of the real work to this object.
class Abstraction
  # @param [Implementation] implementation
  def initialize(implementation)
    @implementation = implementation
  end

  # @return [String]
  def operation
    "Abstraction: Base operation with:\n" \
    "#{@implementation.operation_implementation}"
  end
end
