package com.example.redditclone.models;

import java.util.Arrays;

public enum VoteType {
	UPVOTE(1), DOWNVOTE(-1);

	private int direction;

	VoteType(int direction) {}

	public Integer getDirection() {
		return direction;
	}

	public static VoteType lookup(int direction) {
		return Arrays.stream(VoteType.values())
			.filter(value -> value.getDirection().equals(direction))
			.findAny()
			.orElseThrow();
	}
}
