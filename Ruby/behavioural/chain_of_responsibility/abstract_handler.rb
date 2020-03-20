require('./handler.rb')
# The default chaining behavior can be implemented inside a base handler class.
class AbstractHandler < Handler
  # @return [Handler]
  attr_writer :next_handler

  # @param [Handler] handler
  #
  # @return [Handler]
  def next_handler(handler)
    @next_handler = handler
    # Returning a handler from here will let us link handlers in a convenient
    # way like this:
    # monkey.next_handler(squirrel).next_handler(dog)
    handler
  end

  # @abstract
  #
  # @param [String] request
  #
  # @return [String, nil]
  def handle(request)

    return @next_handler.handle(request) if @next_handler

    nil
  end
end
