package za.ac.cput.repository;

import za.ac.cput.domain.Position;

import java.util.List;

public interface IPositionRepository extends IRepository<Position,String>{
    List<Position> getAll();
}
