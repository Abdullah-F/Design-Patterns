require("./words_collection.rb")
## The client code may or may not know about the Concrete Iterator or Collection
# classes, depending on the level of indirection you want to keep in your
# program.
collection = WordsCollection.new  # => #<WordsCollection:0x000056068463b768 @collection=[]>
collection.add_item('First')  # => ["First"]
collection.add_item('Second')  # => ["First", "Second"]
collection.add_item('Third')  # => ["First", "Second", "Third"]

puts 'Straight traversal:'  # => nil
collection.iterator.each { |item| puts item }  # => ["First", "Second", "Third"]
puts "\n"  # => nil
# => nil
puts 'Reverse traversal:'  # => nil
collection.reverse_iterator.each { |item| puts item }  # => ["Third", "Second", "First"]

# >> Straight traversal:
# >> First
# >> Second
# >> Third
# >>
# >> Reverse traversal:
# >> Third
# >> Second
# >> First
