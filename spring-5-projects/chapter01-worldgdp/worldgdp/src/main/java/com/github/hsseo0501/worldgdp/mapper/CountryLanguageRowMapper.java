package com.github.hsseo0501.worldgdp.mapper;

import com.github.hsseo0501.worldgdp.model.CountryLanguage;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryLanguageRowMapper implements RowMapper<CountryLanguage> {

  public CountryLanguage mapRow(ResultSet resultSet, int i) throws SQLException {
    CountryLanguage countryLng = new CountryLanguage();
    countryLng.setCountryCode(resultSet.getString("countrycode"));
    countryLng.setIsOfficial(resultSet.getString("isofficial"));
    countryLng.setLanguage(resultSet.getString("language"));
    countryLng.setPercentage(resultSet.getDouble("percentage"));
    return countryLng;
  }
}
