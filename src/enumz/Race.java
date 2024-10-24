package enumz;

public enum Race {
    HUMAN, DWARF, ELF;

    @Override
    public String toString() {
        switch (this) {
            case HUMAN:
                return "human";
            case DWARF:
                return "dwarf";
            case ELF:
                return "elf";
            default:
                return "";
        }
    }
    // @Override
    // public List<String> raceList() {
    // List<String> list = new ArrayList<>();

    // for (Race r : Race.values()) {
    // switch (r) {
    // case HUMAN:
    // list.add("human");
    // case DWARF:
    // list.add("dward");
    // case ELF:
    // list.add("elf");
    // default:
    // break;
    // }

    // }
    // return list;
    // }

}
