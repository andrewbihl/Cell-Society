package cell;

import java.util.ArrayList;

public class CellNeighbors {

	private Cell tl; 
	private Cell t; 
	private Cell tr; 
	private Cell r; 
	private Cell br; 
	private Cell b; 
	private Cell bl; 
	private Cell l;
	
	public ArrayList<Cell> toList() {
		ArrayList<Cell> list = new ArrayList<Cell>();
		if(tl!=null)
			list.add(tl);
		if(t!=null)
			list.add(t);
		if(tr!=null)
			list.add(tr);
		if(r!=null)
			list.add(r);
		if(br!=null)
			list.add(br);
		if(b!=null)
			list.add(b);
		if(bl!=null)
			list.add(bl);
		if(l!=null)
			list.add(l);
		return list;
	}
	
	public Cell getTl() {
		return tl;
	}
	public void setTl(Cell tl) {
		this.tl = tl;
	}
	public Cell getT() {
		return t;
	}
	public void setT(Cell t) {
		this.t = t;
	}
	public Cell getTr() {
		return tr;
	}
	public void setTr(Cell tr) {
		this.tr = tr;
	}
	public Cell getR() {
		return r;
	}
	public void setR(Cell r) {
		this.r = r;
	}
	public Cell getBr() {
		return br;
	}
	public void setBr(Cell br) {
		this.br = br;
	}
	public Cell getB() {
		return b;
	}
	public void setB(Cell b) {
		this.b = b;
	}
	public Cell getBl() {
		return bl;
	}
	public void setBl(Cell bl) {
		this.bl = bl;
	}
	public Cell getL() {
		return l;
	}
	public void setL(Cell l) {
		this.l = l;
	}
	
}
