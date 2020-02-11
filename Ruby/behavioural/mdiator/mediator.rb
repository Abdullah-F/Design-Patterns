# The Mediator interface declares a method used by components to notify the
# mediator about various events. The Mediator may react to these events and pass
# the execution to other components.
class Mediator
  # @abstract
  #
  # @param [Object] sender
  # @param [String] event
  def notify(_sender, _event)
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end
end

