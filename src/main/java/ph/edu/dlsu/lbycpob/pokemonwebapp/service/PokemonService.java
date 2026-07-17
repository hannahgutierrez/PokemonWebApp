package ph.edu.dlsu.lbycpob.pokemonwebapp.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import ph.edu.dlsu.lbycpob.pokemonwebapp.model.Pokemon;
import ph.edu.dlsu.lbycpob.pokemonwebapp.model.PokemonFactory;
import ph.edu.dlsu.lbycpob.pokemonwebapp.utils.CsvLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PokemonService {
    public static final String DATA_PATH = "pokemon_list.csv";
    private final List<Pokemon> pokemonList = new ArrayList<>();
    private final Random random = new Random();
