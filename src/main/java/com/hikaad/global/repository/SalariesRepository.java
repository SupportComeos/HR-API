package com.hikaad.global.repository;

import com.hikaad.global.model.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface SalariesRepository extends JpaRepository<Salaries, Long> {

    @Query("select s from Salaries s where s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAllSimple(@Param("dt") Date dt);

    @Query("select s from Salaries s where s.id = :id")
    Salaries findOneSalarie(@Param("id") Long id);





    @Query("select s from Salaries s where s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) and s.enterpriseid in (1000, :enterpriseid) and (s.firstname like %:text% or s.lastname like %:text%) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAll(@Param("enterpriseid") Long enterpriseid,
                           @Param("text") String text,
                           @Param("dt") Date dt);

    @Query("select s from Salaries s where s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) and (s.firstname like %:text% or s.lastname like %:text%) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAll(@Param("text") String text,
                           @Param("dt") Date dt);

    @Query("select s from Salaries s where s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) and s.enterpriseid in (1000, :enterpriseid) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAll(@Param("enterpriseid") Long enterpriseid,
                           @Param("dt") Date dt);

    @Query("select s from Salaries s where s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAll(@Param("dt") Date dt);




    @Query("select s from Salaries s where s.responsableid = :id and s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) and s.enterpriseid in (1000, :enterpriseid) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAllN1(@Param("id") Long id,
                             @Param("enterpriseid") Long enterpriseid,
                             @Param("dt") Date dt);

    @Query("select s from Salaries s where s.responsableid = :id and s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAllN1(@Param("id") Long id,
                             @Param("dt") Date dt);

    @Query("select s from Salaries s where s.responsableid = :id and s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) and s.enterpriseid in (1000, :enterpriseid) and (s.firstname like %:text% or s.lastname like %:text%) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAllN1(@Param("id") Long id,
                             @Param("enterpriseid") Long enterpriseid,
                             @Param("text") String text,
                             @Param("dt") Date dt);

    @Query("select s from Salaries s where s.responsableid = :id and s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) and (s.firstname like %:text% or s.lastname like %:text%) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAllN1(@Param("id") Long id,
                             @Param("text") String text,
                             @Param("dt") Date dt);





    @Query("select s from Salaries s where (s.responsable.responsableid = :id) and s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) and s.enterpriseid in (1000, :enterpriseid) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAllN1All(@Param("id") Long id,
                                @Param("enterpriseid") Long enterpriseid,
                                @Param("dt") Date dt);

    @Query("select s from Salaries s where (s.responsable.responsableid = :id) and s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAllN1All(@Param("id") Long id,
                                @Param("dt") Date dt);

    @Query("select s from Salaries s where (s.responsable.responsableid = :id) and s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) and s.enterpriseid in (1000, :enterpriseid) and (s.firstname like %:text% or s.lastname like %:text%) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAllN1All(@Param("id") Long id,
                                @Param("enterpriseid") Long enterpriseid,
                                @Param("text") String text,
                                @Param("dt") Date dt);

    @Query("select s from Salaries s where (s.responsable.responsableid = :id) and s.neutraliser = 0 and (s.dateout is null or s.dateout >= :dt) and (s.firstname like %:text% or s.lastname like %:text%) order by s.lastname asc, s.firstname asc")
    List<Salaries> findAllN1All(@Param("id") Long id,
                                @Param("text") String text,
                                @Param("dt") Date dt);



    @Query("select s1 from Salaries s1 where s1.id in (select distinct(s2.responsableid) from Salaries s2 order by s2.lastname, s2.firstname)")
    List<Salaries> findResponsable();


}
