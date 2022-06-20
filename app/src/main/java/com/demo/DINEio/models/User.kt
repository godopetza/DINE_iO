package com.demo.DINEio.models

data class User(var fullname : String ?= null, var email : String ?= null, var dob : String ?= null)

data class Order(var preference: String ?= null)
