require('./singleton.rb')

puts Singleton.instance == Singleton.instance

puts Singleton.instance.greet
