require("./base_component.rb")
# Concrete Components implement various functionality. They don't depend on
# other components. They also don't depend on any concrete mediator classes.
class Component1 < BaseComponent
  def do_a
    puts 'Component 1 does A.'
    @mediator.notify(self, 'A')
  end

  def do_b
    puts 'Component 1 does B.'
    @mediator.notify(self, 'B')
  end
end
