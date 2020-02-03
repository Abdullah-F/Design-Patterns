# The Implementation defines the interface for all implementation classes. It
# doesn't have to match the Abstraction's interface. In fact, the two interfaces
# can be entirely different. Typically the Implementation interface provides
# only primitive operations, while the Abstraction defines higher-level
# operations based on those primitives.
class Implementation
  # @abstract
  #
  # @return [String]
  def operation_implementation
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end
end
