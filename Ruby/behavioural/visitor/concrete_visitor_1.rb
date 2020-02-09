require("./visitor.rb")
# Concrete Visitors implement several versions of the same algorithm, which can
# work with all concrete component classes.
#
# You can experience the biggest benefit of the Visitor pattern when using it
# with a complex object structure, such as a Composite tree. In this case, it
# might be helpful to store some intermediate state of the algorithm while
# executing visitor's methods over various objects of the structure.
class ConcreteVisitor1 < Visitor
  def visit_concrete_component_a(element)
    puts "#{element.exclusive_method_of_concrete_component_a} + #{self.class}"
  end

  def visit_concrete_component_b(element)
    puts "#{element.special_method_of_concrete_component_b} + #{self.class}"
  end
end
