require('./singleton')


# @param [String] value
def test_singleton(value)
  singleton = Singleton.instance(value)
  puts singleton.value
end

# The client code.

puts "If you see the same value, then singleton was reused (yay!)\n"\
     "If you see different values, then 2 singletons were created (booo!!)\n\n"\
     "RESULT:\n\n"

process1 = Thread.new { test_singleton('FOO') }
process2 = Thread.new { test_singleton('BAR') }
process1.join
process2.join
