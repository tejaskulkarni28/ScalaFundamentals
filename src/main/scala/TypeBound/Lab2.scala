package TypeBound

// Lower-bound type
object Lab2 extends App {
  class Animal
  class Pet extends Animal
  class Wild extends Animal

  class VeterinaryDoctorForPet[A >: Pet]
  class VeterinaryDoctorForWild[A >: Wild]

  val DoctorJohn:VeterinaryDoctorForPet[Animal]=VeterinaryDoctorForPet[Animal]
  val DoctorJack:VeterinaryDoctorForWild[Animal]=VeterinaryDoctorForWild[Animal]


}
