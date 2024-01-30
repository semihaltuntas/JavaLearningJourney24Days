package be.vdab.hello.jp09records;


public record Persoon(String voornaam, String naam) {
    public Persoon {
        if (voornaam.isBlank() || naam.isBlank()) {
            throw new IllegalArgumentException("Voor- en achternaam mogen niet leeg zijn");
        }
    }

    @Override
    public String toString() {
        return voornaam + " " + naam;
    }
}

