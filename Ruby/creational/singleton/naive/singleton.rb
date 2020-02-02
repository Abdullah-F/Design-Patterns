class Singleton
  attr_reader :greet
  @@instance = nil
  
  def self.instance
    @@instance = @@instance || new('hello world from inside the singleton')
  end

  private_class_method :new  
  private
  
  def initialize str
    @greet = str
  end

end
