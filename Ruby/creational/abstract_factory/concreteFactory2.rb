require("./abstractFactory.rb")
require("./concreteProductA2.rb")
require("./concreteProductB2.rb")
# Each Concrete Factory has a corresponding product variant.
class ConcreteFactory2 < AbstractFactory
  def create_product_a
    ConcreteProductA2.new
  end

  def create_product_b
    ConcreteProductB2.new
  end
end
