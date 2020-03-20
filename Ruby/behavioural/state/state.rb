# The base State class declares methods that all Concrete State should implement
# and also provides a backreference to the Context object, associated with the
# State. This backreference can be used by States to transition the Context to
# another State.
class State
  attr_accessor :context

  # @abstract
  def handle1
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end

  # @abstract
  def handle2
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end
end
