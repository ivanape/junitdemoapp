package com.programwar;

public class DbCalculator {

    private final DbRepository dbRepository;

    public DbCalculator(DbRepository dbRepository) {
        this.dbRepository = dbRepository;
    }

    public int sum(int n1, int n2) throws Exception {
        int result = n1 + n2;
        dbRepository.save(result);
        return result;
    }

    public int subs(int n1, int n2) throws Exception {
        int result = n1 - n2;
        dbRepository.save(result);
        return result;
    }

    public int mult(int n1, int n2) throws Exception {
        int result = n1 * n2;
        dbRepository.save(result);
        return result;
    }

    public int div(int n1, int n2) throws Exception {
        int result = n1 * n2;
        dbRepository.save(result);
        return result;
    }

}
