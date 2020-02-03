require("./abstraction.rb")
# You can extend the Abstraction without changing the Implementation classes.
class ExtendedAbstraction < Abstraction
  # @return [String]
  def operation
    "ExtendedAbstraction: Extended operation with:\n" \
    "#{@implementation.operation_implementation}"
  end
end
