# The Subsystem can accept requests either from the facade or client directly.
# In any case, to the Subsystem, the Facade is yet another client, and it's not
# a part of the Subsystem.
class Subsystem1
  # @return [String]
  def operation1
    "Subsystem1: Ready!"
  end

  # ...

  # @return [String]
  def operation_n
    "Subsystem1: Go!"
  end
end
