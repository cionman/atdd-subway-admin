package nextstep.subway.line.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.NoArgsConstructor;
import nextstep.subway.line.domain.Line;
import nextstep.subway.line.exception.LineNotFoundException;

@Getter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineResponse {
	private Long id;
	private String name;
	private String color;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;

	public LineResponse(Long id, String name, String color, LocalDateTime createdDate, LocalDateTime modifiedDate) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public static LineResponse of(Line line) {
		if (line == null) {
			throw new LineNotFoundException("노선 정보를 찾을 수 없습니다.");
		}
		return new LineResponse(line.getId(), line.getName(), line.getColor(), line.getCreatedDate(),
			line.getModifiedDate());
	}
}
