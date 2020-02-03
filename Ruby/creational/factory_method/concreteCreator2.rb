require("./creator.rb")
require("./concreteProduct2.rb")

class ConcreteCreator2 < Creator
  # @return [ConcreteProduct2]
  def factory_method
    ConcreteProduct2.new
  end
end
