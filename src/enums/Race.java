package enums;

public enum Race {
    HUMAN, DWARF, ELF;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
