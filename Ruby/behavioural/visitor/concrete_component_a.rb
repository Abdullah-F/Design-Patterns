require("./component.rb")
# Each Concrete Component must implement the `accept` method in such a way that  # =>
# it calls the visitor's method corresponding to the component's class.
class ConcreteComponentA < Component
  # Note that we're calling `visitConcreteComponentA`, which matches the current
  # class name. This way we let the visitor know the class of the component it
  # works with.
  def accept(visitor)
    visitor.visit_concrete_component_a(self)
  end

  # Concrete Components may have special methods that don't exist in their base
  # class or interface. The Visitor is still able to use these methods since
  # it's aware of the component's concrete class.
  def exclusive_method_of_concrete_component_a
    'A'
  end
end
