require("./simple_command.rb")
require("./complex_command.rb")
require("./invoker.rb")
require("./receiver.rb")
# The client code can parameterize an invoker with any commands.  # =>
invoker = Invoker.new
invoker.on_start = SimpleCommand.new('Say Hi!')
receiver = Receiver.new
invoker.on_finish = ComplexCommand.new(receiver, 'Send email', 'Save report')

invoker.do_something_important
