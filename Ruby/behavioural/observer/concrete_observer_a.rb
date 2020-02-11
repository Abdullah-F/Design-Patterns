require("./observer.rb")
# Concrete Observers react to the updates issued by the Subject they had been
# attached to.

class ConcreteObserverA < Observer
  # @param [Subject] subject
  def update(subject)
    puts 'ConcreteObserverA: Reacted to the event' if subject.state < 3
  end
end
