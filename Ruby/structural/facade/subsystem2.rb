# Some facades can work with multiple subsystems at the same time.
class Subsystem2
  # @return [String]
  def operation1
    "Subsystem2: Get ready!"
  end

  # ...

  # @return [String]
  def operation_z
    "Subsystem2: Fire!"
  end
end
