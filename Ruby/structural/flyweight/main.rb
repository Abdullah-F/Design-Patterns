require("./flyweightFactory.rb")
# The client code usually creates a bunch of pre-populated flyweights in the
# initialization stage of the application.

factory = FlyweightFactory.new([
  %w[Chevrolet Camaro2018 pink],
  ["(Mercedes-Benz)", "C300", "black"],
  ["(Mercedes-Benz)", "C500", "red"],
  %w[BMW M5 red],
  %w[BMW X6 white],
])

factory.list_flyweights

add_car_to_police_database(factory, "CL234IR", "James Doe", "BMW", "M5", "red")

add_car_to_police_database(factory, "CL234IR", "James Doe", "BMW", "X1", "red")

puts "\n\n"

factory.list_flyweights
