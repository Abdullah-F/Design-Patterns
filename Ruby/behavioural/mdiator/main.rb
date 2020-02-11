require("./component_1.rb")
require("./component_2.rb")
require("./concrete_mediator.rb")  # =>
c1 = Component1.new
c2 = Component2.new
ConcreteMediator.new(c1, c2)

puts 'Client triggers operation A.'
c1.do_a

puts "\n"

puts 'Client triggers operation D.'
c2.do_d
