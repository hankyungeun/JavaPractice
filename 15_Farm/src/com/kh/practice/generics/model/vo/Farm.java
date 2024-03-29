package com.kh.practice.generics.model.vo;

public class Farm {
    private String kind;

    public Farm(){
        
    }
    public Farm(String kind){
        this.kind = kind;
    }
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	@Override
	public int hashCode() {
		return kind.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
        if(obj instanceof Farm)
            return this.kind.equals(((Farm)obj).kind);
		return false;
	}
	@Override
	public String toString() {
		return kind;
	}
    
}
