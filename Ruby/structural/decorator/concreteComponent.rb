require("./decorator")
# Concrete Components provide default implementations of the operations. There
# might be several variations of these classes.
class ConcreteComponent < Component
  # @return [String]
  def operation
    "ConcreteComponent"
  end
end
