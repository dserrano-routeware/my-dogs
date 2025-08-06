package com.martserra.mydogs.api.dto

import com.martserra.mydogs.model.Dog

class DogDTOMapper {

    private fun fromDogDTOtoDogDomain(dogDTO: DogDTO): Dog {
        return Dog(
            id = dogDTO.id,
            index = dogDTO.index,
            name = dogDTO.name,
            breed = dogDTO.breed,
            heightFemale = dogDTO.heightFemale,
            heightMale = dogDTO.heightMale,
            imageUrl = dogDTO.imageUrl,
            lifeExpectancy = dogDTO.lifeExpectancy,
            temperament = dogDTO.temperament,
            weightFemale = dogDTO.weightFemale,
            weightMale = dogDTO.weightMale
        )
    }

    fun fromDogDTOListToDogDomainList(dogDTOList: List<DogDTO>): List<Dog> {
        return dogDTOList.map { fromDogDTOtoDogDomain(it) }
    }
}