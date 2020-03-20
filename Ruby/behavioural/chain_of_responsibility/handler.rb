# The Handler interface declares a method for building the chain of handlers. It
# also declares a method for executing a request.
class Handler
  # @abstract
  #
  # @param [Handler] handler
  def next_handler=(handler)
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end

  # @abstract
  #
  # @param [String] request
  #
  # @return [String, nil]
  def handle(request)
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end
end
