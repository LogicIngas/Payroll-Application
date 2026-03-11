package za.ac.cput.repository;

import za.ac.cput.domain.Position;
import java.util.ArrayList;
import java.util.List;

public class PositionRepository implements IPositionRepository {
    private static PositionRepository repository = null;
    private List<Position> positionList;

    private PositionRepository() {
        positionList = new ArrayList<>();
    }

    public static PositionRepository getRepository() {
        if (repository == null) repository = new PositionRepository();
        return repository;
    }

    @Override
    public Position create(Position position) {
        this.positionList.add(position);
        return position;
    }

    @Override
    public Position read(String positionCode) {
        return positionList.stream()
                .filter(p -> p.getPositionCode().equals(positionCode))
                .findAny()
                .orElse(null);
    }

    @Override
    public Position update(Position position) {
        Position oldPosition = read(position.getPositionCode());
        if (oldPosition != null) {
            this.positionList.remove(oldPosition);
            this.positionList.add(position);
            return position;
        }
        return null;
    }

    @Override
    public boolean delete(String positionCode) {
        Position positionToDelete = read(positionCode);
        if (positionToDelete == null) return false;
        return this.positionList.remove(positionToDelete);
    }

    @Override
    public List<Position> getAll() {
        return positionList;
    }
}