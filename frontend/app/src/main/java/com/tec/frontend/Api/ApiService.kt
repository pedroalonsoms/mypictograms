package com.tec.frontend.Api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @POST("/api/login")
    suspend fun login(@Body request: loginRequest): Response<loginResponse>

    @POST("/api/admins")
    suspend fun createAdmin(@Body request: registerRequest): Response<Void>

    @POST("/api/parents")
    suspend fun createParent(@Body request: registerRequest): Response<Void>

    @POST("/api/students")
    suspend fun insertalumno(@Body alumno: Alumno) : Response<Void>

    @GET("/api/students")
    suspend fun infoAlumno(@Query("therapistId") AdminID: Int) : List<Alumno>

    @GET("/api/students/{alumnoId}")
    suspend fun getEstudiante(@Path("alumnoId") alumnoId: Int): List<Alumno>

    @GET("/api/students/parent/{ParentId}")
    suspend fun getHijos(@Path("ParentId") ParentId: Int): List<Alumno>

    @GET("/api/students/")
    suspend fun getEstudiantes() : List<Alumno>

    @GET("/api/parents/")
    suspend fun getPadres() : List<Padre>

    @GET("/api/admins")
    suspend fun getTerapia(): List<Terapeuta>

    @GET("/api/parents/{parentId}")
    suspend fun getNombrePadres(@Path("parentId") parentId : Int) : Padre

    @PUT("/api/students/{alumnoId}")
    suspend fun actualizarAlumno(@Path("alumnoId") alumnoId: Int, @Body alumno: Alumno): Response<Void>

    @GET("/api/categories/student/{alumnoId}")
    suspend fun getCategory(@Path("alumnoId") alumnoId: Int): List<Category>

    @GET("/api/images/category/{categoryName}/student/{alumnoId}")
    suspend fun getComunicadorCategory(@Path("categoryName") categoryName : String, @Path("alumnoId") alumnoId : Int): List<Images>
}
