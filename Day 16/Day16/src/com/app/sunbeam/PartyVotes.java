package com.app.sunbeam;

public class PartyVotes {
	String party;
	int votes;
	public PartyVotes(String party, int votes) {
		super();
		this.party = party;
		this.votes = votes;
	}
	public PartyVotes() {
		super();
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	@Override
	public String toString() {
		return "PartyVotes [party=" + party + ", votes=" + votes + "]";
	}
}
