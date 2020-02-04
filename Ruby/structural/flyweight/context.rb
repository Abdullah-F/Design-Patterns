require("json")

class Context
  attr_accessor :unique_state

  # @param [String] unique_state
  # @param [Flyweight] fly weight with the shared state
  def initialize(flyweight, unique_state)
    @unique_state = unique_state
    @flyweight = flyweight
  end

  # @param [String] unique_state
  def operation
    s = @flyweight.operation
    u = @unique_state.to_json
    puts "Context: Displaying shared (#{s}) and unique (#{u}) state."
  end
end
