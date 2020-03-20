require("./concrete_class_1.rb")
require("./concrete_class_2.rb")
# The client code calls the template method to execute the algorithm. Client
# code does not have to know the concrete class of an object it works with, as
# long as it works with objects through the interface of their base class.
def client_code(abstract_class)
  # ...
  abstract_class.template_method
  # ...
end

puts 'Same client code can work with different subclasses:'
client_code(ConcreteClass1.new)  # => nil
puts "\n"

puts 'Same client code can work with different subclasses:'
client_code(ConcreteClass2.new)  # => nil

# >> Same client code can work with different subclasses:
# >> AbstractClass says: I am doing the bulk of the work
# >> ConcreteClass1 says: Implemented Operation1
# >> AbstractClass says: But I let subclasses override some operations
# >> ConcreteClass1 says: Implemented Operation2
# >> AbstractClass says: But I am doing the bulk of the work anyway
# >>
# >> Same client code can work with different subclasses:
# >> AbstractClass says: I am doing the bulk of the work
# >> ConcreteClass2 says: Implemented Operation1
# >> AbstractClass says: But I let subclasses override some operations
# >> ConcreteClass2 says: Overridden Hook1
# >> ConcreteClass2 says: Implemented Operation2
# >> AbstractClass says: But I am doing the bulk of the work anyway
