require('./monkey_handler.rb')
require('./squirrel_handler.rb')
require('./dog_handler.rb')
# The client code is usually suited to work with a single handler. In most
# cases, it is not even aware that the handler is part of a chain.
def client_code(handler)
  ['Nut', 'Banana', 'Cup of coffee'].each do |food|
    puts "\nClient: Who wants a #{food}?"
    result = handler.handle(food)
    if result
      print "  #{result}"
    else
      print "  #{food} was left untouched."
    end
  end
end

monkey = MonkeyHandler.new
squirrel = SquirrelHandler.new
dog = DogHandler.new

monkey.next_handler(squirrel).next_handler(dog)

# The client should be able to send a request to any handler, not just the first
# one in the chain.
puts 'Chain: Monkey > Squirrel > Dog'
client_code(monkey)
puts "\n\n"

puts 'Subchain: Squirrel > Dog'
client_code(squirrel)
