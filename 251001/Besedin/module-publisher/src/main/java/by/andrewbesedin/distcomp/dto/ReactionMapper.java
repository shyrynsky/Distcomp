package by.andrewbesedin.distcomp.dto;

import by.andrewbesedin.distcomp.entities.Reaction;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReactionMapper {
    ReactionResponseTo out(Reaction editor);

    Reaction in(ReactionRequestTo editor);
}
